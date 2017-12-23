# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides robot, sensor implementation, using nodelets for stdr_server to load th"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "actionlib catkin-native geometry-msgs nav-msgs nodelet roscpp sensor-msgs stdr-msgs stdr-parser stdr-server tf"
SRC_URI = "https://github.com/stdr-simulator-ros-pkg/stdr_simulator-release/archive/release/kinetic/stdr_robot/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "66a8077c60d48e513994eee3d3cdbecb"
SRC_URI[sha256sum] = "8f462e093caac6e63e5cfe3a6985a9863b9106bf3ef4b23a85e48089b588ff77"
S = "${WORKDIR}/stdr_simulator-release-release-kinetic-stdr_robot-0.3.2-0"

inherit catkin
