# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A path planner library and node."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles catkin-native costmap-2d dynamic-reconfigure geometry-msgs nav-core nav-msgs navfn pluginlib roscpp tf"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/kinetic/global_planner/1.14.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8fdfee533a335e1173c5ea923d5c400b"
SRC_URI[sha256sum] = "c42d6cfa251663f073f89a8d37c7773cc0cb1fe7753cb76037421e8372f8b4bf"
S = "${WORKDIR}/navigation-release-release-kinetic-global_planner-1.14.2-0"

inherit catkin
