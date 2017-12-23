# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Transports audio from a source to a destination. Audio sources can come       fr"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=a3ae2ba3f0f44e61270955e8cd98afcf"

DEPENDS = "audio-common-msgs catkin-native gstreamer1.0 gstreamer1.0-plugins-base gstreamer1.0-plugins-good gstreamer1.0-plugins-ugly libgstreamer-plugins-base1.0-dev libgstreamer1.0-dev roscpp"
SRC_URI = "https://github.com/ros-gbp/audio_common-release/archive/release/kinetic/audio_capture/0.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1068768ac7c2f2f5c6ed2fd6fd0b9878"
SRC_URI[sha256sum] = "e66d7d74afa1e4389308db4e7819a19e6977e7a40ae03fa75d17232d6312d0da"
S = "${WORKDIR}/audio_common-release-release-kinetic-audio_capture-0.3.1-0"

inherit catkin
