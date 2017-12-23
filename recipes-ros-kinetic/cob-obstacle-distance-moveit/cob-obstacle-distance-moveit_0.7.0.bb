# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides nodes for calculating the minimal distance to robot links,"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=58d727014cda5ed405b7fb52666a1f97"

DEPENDS = "boost catkin-native cob-control-msgs cob-srvs eigen-conversions geometric-shapes geometry-msgs libfcl-dev moveit-core moveit-msgs moveit-ros-perception moveit-ros-planning-interface pkgconfig roscpp rospy tf tf-conversions"
SRC_URI = "https://github.com/ipa320/cob_manipulation-release/archive/release/kinetic/cob_obstacle_distance_moveit/0.7.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7110f429a977df928d0e8178b3644bd1"
SRC_URI[sha256sum] = "385b0af4bde64bc68d187937ce0aee1086a7dfc9f16ef463fcde00d7dda84e8c"
S = "${WORKDIR}/cob_manipulation-release-release-kinetic-cob_obstacle_distance_moveit-0.7.0-0"

inherit catkin
