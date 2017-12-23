# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides launch files for starting a simulated Care-O-bot."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-default-env-config cob-default-robot-config cob-gazebo cob-gazebo-worlds gazebo-msgs gazebo-ros geometry-msgs python-numpy roslaunch roslib rospy tf"
SRC_URI = "https://github.com/ipa320/cob_simulation-release/archive/release/kinetic/cob_bringup_sim/0.6.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9aabe126a13a3e0a1bc1fbbf7e368618"
SRC_URI[sha256sum] = "87c8544d2345260ae5f99325ff1e305a46742019b34663e7e2ec74e6373ed3a7"
S = "${WORKDIR}/cob_simulation-release-release-kinetic-cob_bringup_sim-0.6.8-0"

inherit catkin
