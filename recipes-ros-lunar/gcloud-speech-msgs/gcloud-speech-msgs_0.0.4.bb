# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS message definitions for gcloud_speech and relevant packages."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs catkin-native message-generation message-runtime"
SRC_URI = "https://github.com/CogRobRelease/gcloud_speech-release/archive/release/lunar/gcloud_speech_msgs/0.0.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6d992e22b76fedb00823e643ca7d4486"
SRC_URI[sha256sum] = "28173bcc59e22363ac675a2896b5fc90ebf60e81bfdc4b18884ea5774cedb1ee"
S = "${WORKDIR}/gcloud_speech-release-release-lunar-gcloud_speech_msgs-0.0.4-0"

inherit catkin
