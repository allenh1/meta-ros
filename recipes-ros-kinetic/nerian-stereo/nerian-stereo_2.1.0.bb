# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Driver node for SceneScan and SP1 stereo vision sensors by Nerian Vision Technol"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "boost catkin-native cv-bridge message-generation message-runtime roscpp sdl sensor-msgs std-msgs"
SRC_URI = "https://github.com/nerian-vision/nerian_stereo-release/archive/release/kinetic/nerian_stereo/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4aaa34671cb393295a3cf0c8715ff62d"
SRC_URI[sha256sum] = "bc555cf469945916d090bc6df461e9a69c0106a3f60b9445c5a87356ec8b6ba4"
S = "${WORKDIR}/nerian_stereo-release-release-kinetic-nerian_stereo-2.1.0-0"

inherit catkin
