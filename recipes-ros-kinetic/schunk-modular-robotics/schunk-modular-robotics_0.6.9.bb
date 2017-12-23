# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This stack includes packages that provide access to the Schunk hardware through "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native schunk-description schunk-libm5api schunk-powercube-chain schunk-sdh schunk-simulated-tactile-sensors"
SRC_URI = "https://github.com/ipa320/schunk_modular_robotics-release/archive/release/kinetic/schunk_modular_robotics/0.6.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e6fe624aaa0141f915b9370a776c592a"
SRC_URI[sha256sum] = "3cc0d55a90f4dc8ade1f6f552056d77f5f6883daea64fbac89d5ec695c78940f"
S = "${WORKDIR}/schunk_modular_robotics-release-release-kinetic-schunk_modular_robotics-0.6.9-0"

inherit catkin
