# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=7;endline=7;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin diagnostic_updater geometry_msgs kdl_parser nav_msgs p2os_msgs roscpp std_msgs tf"
SRC_URI = "https://github.com/allenh1/p2os-release/archive/release/lunar/p2os_driver/2.0.7-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "265083863bde6ea1ac928d228bc6a521"
SRC_URI[sha256sum] = "b81aec1eb244475735cd99630b464037c976aecbc97da481fa7611c37670e994"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
