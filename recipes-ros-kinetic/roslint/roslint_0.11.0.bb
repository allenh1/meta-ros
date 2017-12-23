# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "CMake lint commands for ROS packages.      The lint commands perform static chec"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/kinetic/${PN}/0.11.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b9be9ba8b45565520b61bb024b3981a2"
SRC_URI[sha256sum] = "b08fb487af9e026669d6ee86ebc209974d35b37542f844f40508e2411a3245df"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.11.0-0"

inherit catkin
