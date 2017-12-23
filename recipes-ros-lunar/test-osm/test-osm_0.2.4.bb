# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "These are regression tests for the osm_cartography and      route_network packag"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geodesy geographic-msgs osm-cartography route-network"
SRC_URI = "https://github.com/ros-geographic-info/open_street_map-release/archive/release/lunar/test_osm/0.2.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "db81d464b16558dc62b7daaee552dd3a"
SRC_URI[sha256sum] = "f56226c9cc20f857b30e0e1912f74858e25873f1a54ee9801f483e0aa4aa0b36"
S = "${WORKDIR}/open_street_map-release-release-lunar-test_osm-0.2.4-0"

inherit catkin
