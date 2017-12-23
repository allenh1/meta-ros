# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Common code for working with audio in ROS"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=e412bfc9312ba25bfbb7ea55d4c4409c"

DEPENDS = "audio-capture audio-common-msgs audio-play catkin-native sound-play"
SRC_URI = "https://github.com/ros-gbp/audio_common-release/archive/release/kinetic/audio_common/0.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0d2114ca9796a37a0c77338e265c15f1"
SRC_URI[sha256sum] = "b294727bc5c065ede10f477950739d0466b966cdae2024443676abd65fe431f5"
S = "${WORKDIR}/audio_common-release-release-kinetic-audio_common-0.3.1-0"

inherit catkin
