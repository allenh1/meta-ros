# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Driver file descriptions for P2OS/ARCOS robot"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin diagnostic-updater geometry-msgs kdl-parser message-runtime nav-msgs p2os-msgs roscpp std-msgs tf"
SRC_URI = "https://github.com/allenh1/p2os-release/archive/release/lunar/p2os_driver/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4b19feb0dad75b3c88f35e4d6e8b0e42"
SRC_URI[sha256sum] = "3f0aab668693b1ecac8a9afbb228ec5474b0255b697f959d7055e7e997aab94c"
S = "${WORKDIR}/p2os-release-release-lunar-p2os_driver-2.1.0-0"

inherit catkin
