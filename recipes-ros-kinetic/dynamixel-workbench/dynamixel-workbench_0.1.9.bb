# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Dynamixel-Workbench is dynamixel solution for ROS.     This metapackage allows y"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "catkin-native dynamixel-workbench-controllers dynamixel-workbench-operators dynamixel-workbench-single-manager dynamixel-workbench-single-manager-gui dynamixel-workbench-toolbox"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/${PN}-release/archive/release/kinetic/dynamixel_workbench/0.1.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "54b10c798745faf6dede5ad1867ecd8b"
SRC_URI[sha256sum] = "ad562bb39ab2b43c728cd8a08a424bd9c0d3fca9dc51204a60fe8c06ccd7cc09"
S = "${WORKDIR}/${PN}-release-release-kinetic-dynamixel_workbench-0.1.9-0"

inherit catkin
