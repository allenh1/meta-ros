# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Geographic mapping using Open Street Map data."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin dynamic-reconfigure geodesy geographic-msgs geometry-msgs rospy route-network rviz std-msgs tf visualization-msgs"
SRC_URI = "https://github.com/ros-geographic-info/open_street_map-release/archive/release/lunar/osm_cartography/0.2.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a2e3d075627deacc54b05438550878d2"
SRC_URI[sha256sum] = "020bae6b6f3d53f164357a7bc5ddc5108505da00af531fff7ed405bf91c0a62c"
S = "${WORKDIR}/open_street_map-release-release-lunar-osm_cartography-0.2.4-0"

inherit catkin
