# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package holds a collection of plugins for the RobotNavigator, that provide "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "catkin-native geometry-msgs nav2d-navigator nav-msgs pluginlib roscpp tf visualization-msgs"
SRC_URI = "https://github.com/skasperski/navigation_2d-release/archive/release/kinetic/nav2d_exploration/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a66bd9d4e5b0ee819acbe6e198c75442"
SRC_URI[sha256sum] = "778c62212eeb65345efd7072ea49a90e412b32621ea7b6262c7a0fd4b7c645d5"
S = "${WORKDIR}/navigation_2d-release-release-kinetic-nav2d_exploration-0.3.2-0"

inherit catkin
