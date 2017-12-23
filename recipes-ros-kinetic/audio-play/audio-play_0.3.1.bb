# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Outputs audio to a speaker from a source node."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=a3ae2ba3f0f44e61270955e8cd98afcf"

DEPENDS = "audio-common-msgs catkin-native gstreamer1.0 gstreamer1.0-plugins-base gstreamer1.0-plugins-good gstreamer1.0-plugins-ugly libgstreamer-plugins-base1.0-dev libgstreamer1.0-dev roscpp"
SRC_URI = "https://github.com/ros-gbp/audio_common-release/archive/release/kinetic/audio_play/0.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ea95e9f6d72370798c194375bd16d3e4"
SRC_URI[sha256sum] = "55e7c0d847677ceda03d85df446fae42b2a176699f732fee9e7c91b6372369ed"
S = "${WORKDIR}/audio_common-release-release-kinetic-audio_play-0.3.1-0"

inherit catkin
