# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A metapackage to bring in the default packages second generation Transform Libra"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native tf2 tf2-bullet tf2-eigen tf2-geometry-msgs tf2-kdl tf2-msgs tf2-py tf2-ros tf2-sensor-msgs tf2-tools"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/kinetic/${PN}/0.5.16-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5ae530df8e500b6d2c834687fd003aae"
SRC_URI[sha256sum] = "6cd1df149cb6e9f5cb59852525a3a43abaf48ed6528ac9b2d268bc63a5acb753"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.5.16-0"

inherit catkin
