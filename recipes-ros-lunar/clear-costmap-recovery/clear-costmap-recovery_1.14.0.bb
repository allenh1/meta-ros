# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides a recovery behavior for the navigation stack that attempts"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=acbed67fd486c51e7a0624505f2e6733"

DEPENDS = "catkin cmake_modules costmap_2d eigen nav_core pluginlib roscpp tf"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/clear_costmap_recovery/1.14.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "99c4b8e4a9e162a64b5e26a96611b382"
SRC_URI[sha256sum] = "1917a05b7287cae796e8a09f270b0b2e86b0ebf1a8f565c80eb8d6f54cfb2068"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
