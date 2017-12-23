# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Node for the SP1 Stereo Vision System by Nerian Vision Technologies"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "boost catkin-native cv-bridge message-generation message-runtime roscpp sdl sensor-msgs std-msgs"
SRC_URI = "https://github.com/nerian-vision/nerian_sp1-release/archive/release/kinetic/nerian_sp1/1.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "503dae63b00813335134231aba1e25af"
SRC_URI[sha256sum] = "762f0d92554264c1da7e8e398f9d1c37cd04f91d223d84de29c79871393d8d08"
S = "${WORKDIR}/nerian_sp1-release-release-kinetic-nerian_sp1-1.6.3-0"

inherit catkin
