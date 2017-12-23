# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "map_server provides the  ROS , which offers map data as a ROS . It also provides"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "bullet catkin-native nav-msgs roscpp sdl sdl-image tf2 yaml-cpp"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/kinetic/map_server/1.14.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "189568426f22e40f41260cb31a53adc5"
SRC_URI[sha256sum] = "bae1358937b2d4bbe6a04e275a9eea887170b92019d5db417edab83634dfcd1d"
S = "${WORKDIR}/navigation-release-release-kinetic-map_server-1.14.2-0"

inherit catkin
