# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "These are regression tests for the osm_cartography and      route_network packag"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geodesy geographic-msgs osm-cartography route-network"
SRC_URI = "https://github.com/ros-geographic-info/open_street_map-release/archive/release/kinetic/test_osm/0.2.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f71921576f1a3ef97cd14183e9a77056"
SRC_URI[sha256sum] = "7fd6af55b0a2548b5d501882bcac1429f7ad9039be66bc07a5049b6229cdeb17"
S = "${WORKDIR}/open_street_map-release-release-kinetic-test_osm-0.2.4-0"

inherit catkin
