# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Neato XV-11 Laser Driver. This driver works with the laser when it is removed fr"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "boost catkin-native roscpp sensor-msgs"
SRC_URI = "https://github.com/rohbotics/xv_11_laser_driver-release/archive/release/kinetic/xv_11_laser_driver/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "faed30f68dcc9fe5a85e2056a244b6f3"
SRC_URI[sha256sum] = "3367511ab65de9627e4c08e0ff9da72c8d88be900f6c9eb3a42dece062f9a7cb"
S = "${WORKDIR}/xv_11_laser_driver-release-release-kinetic-xv_11_laser_driver-0.3.0-0"

inherit catkin
