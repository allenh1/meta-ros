# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "diagnostic_aggregator"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "bondcpp bondpy catkin diagnostic-msgs pluginlib roscpp rospy rostest xmlrpcpp"
SRC_URI = "https://github.com/ros-gbp/diagnostics-release/archive/release/lunar/diagnostic_aggregator/1.9.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "28eaa9eecca8ae4e349207aa9c1a533e"
SRC_URI[sha256sum] = "6168e1c53ceb1ec49a557a56c42ee97ea8702a9f54c3151cff8ee858838b1ea7"
S = "${WORKDIR}/diagnostics-release-release-lunar-diagnostic_aggregator-1.9.2-0"

inherit catkin
