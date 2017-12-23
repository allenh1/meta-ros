# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Route network graphing and path planning."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native dynamic-reconfigure geodesy geographic-msgs geometry-msgs nav-msgs rospy rostest visualization-msgs"
SRC_URI = "https://github.com/ros-geographic-info/open_street_map-release/archive/release/lunar/route_network/0.2.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "eeea57fb5d8416820d232db4facad596"
SRC_URI[sha256sum] = "da6edde2357f78c8c91c83eda8eac318e695d4c90f74b3b9c31dad2276cf67b7"
S = "${WORKDIR}/open_street_map-release-release-lunar-route_network-0.2.4-0"

inherit catkin
