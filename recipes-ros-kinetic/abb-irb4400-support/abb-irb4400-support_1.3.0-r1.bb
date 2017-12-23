# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=29;endline=29;md5=c93e37fc0c6f510db5735eb91dcc1550"

DEPENDS = "abb-driver abb-resources catkin-native joint-state-publisher robot-state-publisher roslaunch rviz xacro"
SRC_URI = "https://github.com/ros-industrial-release/abb-release/archive/release/kinetic/abb_irb4400_support/1.3.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4c1bf40aca24934447b9c3b375cb34af"
SRC_URI[sha256sum] = "fba02c735b2ac29578a195038078f4477ca047634b60d1e8b7048feebabd6c09"
S = "${WORKDIR}/abb-release-release-kinetic-abb_irb4400_support-1.3.0-1"

inherit catkin
