# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Utilities and examples for gcloud_speech package."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs catkin-native gcloud-speech-msgs libgflags-dev libgoogle-glog-dev portaudio19-dev python-pyaudio"
SRC_URI = "https://github.com/CogRobRelease/gcloud_speech-release/archive/release/kinetic/gcloud_speech_utils/0.0.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4261de2026d46d0f8132327ff9e47d18"
SRC_URI[sha256sum] = "085670c76c8a16546d17124e0533a0098766460e3fc6e63279e8ed492a6d1243"
S = "${WORKDIR}/gcloud_speech-release-release-kinetic-gcloud_speech_utils-0.0.4-0"

inherit catkin
