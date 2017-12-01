# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Driver node for SceneScan and SP1 stereo vision sensors by Nerian Vision Technol"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "boost catkin-native cv-bridge message-generation message-runtime roscpp sdl sensor-msgs std-msgs"
SRC_URI = "https://github.com/nerian-vision/nerian_stereo-release/archive/release/lunar/nerian_stereo/2.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8004da7573c1e20f995161d4448b263f"
SRC_URI[sha256sum] = "d1392d9546150860a13022bdea11ecd14c42a6f6d8e9b723c775fbe1d020f06f"
S = "${WORKDIR}/nerian_stereo-release-release-lunar-nerian_stereo-2.0.3-0"

inherit catkin
