# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS wrapper for Python SpeechRecognition library"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "audio-capture audio-common-msgs catkin-native dynamic-reconfigure python-speechrecognition-pip sound-play speech-recognition-msgs"
SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/kinetic/ros_speech_recognition/2.1.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "01bfb82b13196678ae6547c6e9f1bcce"
SRC_URI[sha256sum] = "7e6e17049f85bc917395906c255e667cc9231fefda037ee2d5e6f7b6ebaa3285"
S = "${WORKDIR}/jsk_3rdparty-release-release-kinetic-ros_speech_recognition-2.1.6-0"

inherit catkin
