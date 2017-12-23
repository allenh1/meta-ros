# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Ethernet interface to OxTS GPS receivers (NCOM packet structure)"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs nav-msgs roscpp sensor-msgs tf"
SRC_URI = "https://github.com/DataspeedInc-release/oxford_gps_eth-release/archive/release/kinetic/oxford_gps_eth/0.0.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "444dc304af138fbd4cfc1ef348919d16"
SRC_URI[sha256sum] = "2c89abd8553cfed30daab2ee31dbcdf85663616af0baebcf406acabe765e37b8"
S = "${WORKDIR}/oxford_gps_eth-release-release-kinetic-oxford_gps_eth-0.0.5-0"

inherit catkin
