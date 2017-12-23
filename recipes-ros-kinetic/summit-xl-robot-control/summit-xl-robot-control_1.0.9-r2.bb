# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Control the robot joints in all kinematic configurations, publishes odom topic a"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-msgs diagnostic-updater geometry-msgs nav-msgs robotnik-msgs roscpp sensor-msgs tf"
SRC_URI = "https://github.com/RobotnikAutomation/summit_xl_sim-release/archive/release/kinetic/summit_xl_robot_control/1.0.9-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a7515c6a88d2e5dd955a4341f4b23f2a"
SRC_URI[sha256sum] = "fcca8b4d6c022209209e109e683e31adbfbabb999c6bd0718c15561d6e583e4c"
S = "${WORKDIR}/summit_xl_sim-release-release-kinetic-summit_xl_robot_control-1.0.9-2"

inherit catkin
