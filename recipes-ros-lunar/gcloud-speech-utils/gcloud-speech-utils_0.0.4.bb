# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Utilities and examples for gcloud_speech package."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs catkin-native catkin gcloud-speech-msgs libgflags-dev libgoogle-glog-dev portaudio19-dev python-pyaudio"
SRC_URI = "https://github.com/CogRobRelease/gcloud_speech-release/archive/release/lunar/gcloud_speech_utils/0.0.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1d48edf8411b29135f085f7dfacb8681"
SRC_URI[sha256sum] = "39171c331e4d70e78b423ec18c3a87b477316c927b309a1ee62219fb0c22554e"
S = "${WORKDIR}/gcloud_speech-release-release-lunar-gcloud_speech_utils-0.0.4-0"

inherit catkin
