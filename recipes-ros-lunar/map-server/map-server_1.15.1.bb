# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "map_server provides the  ROS , which offers map data as a ROS . It also provides"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "bullet catkin-native nav-msgs roscpp sdl sdl-image tf2 yaml-cpp"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/map_server/1.15.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "304bc232a3b01c71f499ecc63f7b3c06"
SRC_URI[sha256sum] = "fa8da28529d8a51704e9aa3c559bd6b283eec940df911730bbb37f0b9facd790"
S = "${WORKDIR}/navigation-release-release-lunar-map_server-1.15.1-0"

inherit catkin
