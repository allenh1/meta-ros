# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Driver file descriptions for P2OS/ARCOS robot"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-updater geometry-msgs kdl-parser message-runtime nav-msgs p2os-msgs roscpp std-msgs tf"
SRC_URI = "https://github.com/allenh1/p2os-release/archive/release/kinetic/p2os_driver/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "20f756bf952ae95ea8d1cdf7bec691b9"
SRC_URI[sha256sum] = "eb6f5a08cf1e70e2160dddf092289989841b16739f16d4431db1de6ba572fc14"
S = "${WORKDIR}/p2os-release-release-kinetic-p2os_driver-2.1.0-0"

inherit catkin
