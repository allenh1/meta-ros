# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Driver file descriptions for P2OS/ARCOS robot"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "catkin diagnostic_updater geometry_msgs kdl_parser nav_msgs p2os_msgs roscpp std_msgs tf"
SRC_URI = "https://github.com/allenh1/p2os-release/archive/release/lunar/p2os_driver/2.0.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "265083863bde6ea1ac928d228bc6a521"
SRC_URI[sha256sum] = "b81aec1eb244475735cd99630b464037c976aecbc97da481fa7611c37670e994"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
