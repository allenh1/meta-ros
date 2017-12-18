# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Driver node for SceneScan and SP1 stereo vision sensors by Nerian Vision Technol"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "boost catkin-native catkin cv-bridge message-generation message-runtime roscpp sdl sensor-msgs std-msgs"
SRC_URI = "https://github.com/nerian-vision/nerian_stereo-release/archive/release/lunar/nerian_stereo/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "decc915fb4741d6d888dd807cf21b0e9"
SRC_URI[sha256sum] = "ff37230b7c62873032244384a52c88bcbbe785780f549f39b537574e13e4aaa8"
S = "${WORKDIR}/nerian_stereo-release-release-lunar-nerian_stereo-2.1.0-0"

inherit catkin
