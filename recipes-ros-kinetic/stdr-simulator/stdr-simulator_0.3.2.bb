# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A simple, flexible and scalable 2D multi-robot simulator."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "catkin-native stdr-gui stdr-launchers stdr-msgs stdr-parser stdr-resources stdr-robot stdr-samples stdr-server"
SRC_URI = "https://github.com/${PN}-ros-pkg/stdr_simulator-release/archive/release/kinetic/stdr_simulator/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b84463c332a2f1ee88964ff515899d09"
SRC_URI[sha256sum] = "0599f1356795693cfc1072c547085b8bb62cc639183a7d444e4fc936ac409230"
S = "${WORKDIR}/stdr_simulator-release-release-kinetic-stdr_simulator-0.3.2-0"

inherit catkin
