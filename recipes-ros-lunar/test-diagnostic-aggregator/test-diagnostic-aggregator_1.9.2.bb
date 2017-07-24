# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Basic diagnostic_aggregator tests are  in the"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-empy-native diagnostic-aggregator diagnostic-msgs pluginlib roscpp rospy rostest"
SRC_URI = "https://github.com/ros-gbp/diagnostics-release/archive/release/lunar/test_diagnostic_aggregator/1.9.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "636e9f6900879f90bbba88086ae15a75"
SRC_URI[sha256sum] = "f63cfd5187fbb4dbf9110818a813bef4c86cf7f388e46b8cd1da7f942a9cb504"
S = "${WORKDIR}/diagnostics-release-release-lunar-test_diagnostic_aggregator-1.9.2-0"

inherit catkin
