# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Implements synchronization and coordination functionalities of STDR Simulator."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "actionlib catkin-native map-server nav-msgs nodelet roscpp stdr-msgs tf visualization-msgs yaml-cpp"
SRC_URI = "https://github.com/stdr-simulator-ros-pkg/stdr_simulator-release/archive/release/kinetic/stdr_server/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "971127f373b8d9b999578f16c03f9cb6"
SRC_URI[sha256sum] = "4ea189d59daad28cb6a5b5ab61286e28d56898a9110b53e741c0c15be128c07c"
S = "${WORKDIR}/stdr_simulator-release-release-kinetic-stdr_server-0.3.2-0"

inherit catkin
