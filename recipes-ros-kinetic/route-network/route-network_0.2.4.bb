# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Route network graphing and path planning."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native dynamic-reconfigure geodesy geographic-msgs geometry-msgs nav-msgs rospy rostest visualization-msgs"
SRC_URI = "https://github.com/ros-geographic-info/open_street_map-release/archive/release/kinetic/route_network/0.2.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "62c055fd572bf72c8b07c932dd12fbc9"
SRC_URI[sha256sum] = "8aa80c3077576ce20a1b468ced79a0cd74b98c2d21aa8cce04f124b7719e7232"
S = "${WORKDIR}/open_street_map-release-release-kinetic-route_network-0.2.4-0"

inherit catkin
