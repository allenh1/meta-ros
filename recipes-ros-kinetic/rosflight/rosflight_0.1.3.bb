# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package for interfacing to the ROSflight autopilot firmware over MAVLink"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native eigen geometry-msgs git pkgconfig roscpp rosflight-msgs sensor-msgs std-msgs std-srvs tf yaml-cpp"
SRC_URI = "https://github.com/${PN}/${PN}-release/archive/release/kinetic/${PN}/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dbd1e4ff50aa81d35d01eaf9aaff1e57"
SRC_URI[sha256sum] = "90f75bfdf75007940d20be85feb930576c1f01b5cc2624322b99b077158ddc83"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.1.3-0"

inherit catkin
