# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Node for the SP1 Stereo Vision System by Nerian Vision Technologies"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "boost catkin-native catkin cv-bridge message-generation message-runtime roscpp sdl sensor-msgs std-msgs"
SRC_URI = "https://github.com/nerian-vision/nerian_sp1-release/archive/release/lunar/nerian_sp1/1.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "668862659550ea38adc91e999e72029f"
SRC_URI[sha256sum] = "d44e98b1290148b429b9142297db76874c4b10dae4011361874b58d3160ab166"
S = "${WORKDIR}/nerian_sp1-release-release-lunar-nerian_sp1-1.6.3-0"

inherit catkin
