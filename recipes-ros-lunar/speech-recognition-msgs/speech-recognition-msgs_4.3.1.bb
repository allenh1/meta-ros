# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "speech_recognition_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/tork-a/jsk_common_msgs-release/archive/release/lunar/speech_recognition_msgs/4.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9c2610ac450fb680c220fbb80f182cb0"
SRC_URI[sha256sum] = "83c46a51fea3761f44a536354148166f99e97421eabe3473b0cf8a8c913222d2"
S = "${WORKDIR}/jsk_common_msgs-release-release-lunar-speech_recognition_msgs-4.3.1-0"

inherit catkin
