# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Geographic mapping using Open Street Map data."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native dynamic-reconfigure geodesy geographic-msgs geometry-msgs rospy route-network rviz std-msgs tf visualization-msgs"
SRC_URI = "https://github.com/ros-geographic-info/open_street_map-release/archive/release/kinetic/osm_cartography/0.2.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1c890d7f6904a51e9c0f148f3414c3a5"
SRC_URI[sha256sum] = "b7b44c6d2025f65348f479c1c748e9dc56d9bb6fbda5c6f37fac01de6c428f40"
S = "${WORKDIR}/open_street_map-release-release-kinetic-osm_cartography-0.2.4-0"

inherit catkin
