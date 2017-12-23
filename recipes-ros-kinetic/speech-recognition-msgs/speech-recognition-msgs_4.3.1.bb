# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "speech_recognition_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/tork-a/jsk_common_msgs-release/archive/release/kinetic/speech_recognition_msgs/4.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dcec9686f7af94ea05f705462d0634a8"
SRC_URI[sha256sum] = "bb5f1a028ac1bdf5b06c306180309aff700fc73898efed5a3b5b930f7eb3ec7d"
S = "${WORKDIR}/jsk_common_msgs-release-release-kinetic-speech_recognition_msgs-4.3.1-0"

inherit catkin
