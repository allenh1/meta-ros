# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides common interfaces for navigation specific robot actions. C"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "catkin-native catkin costmap-2d geometry-msgs std-msgs tf"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/nav_core/1.15.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "98112433f5cfe20e30eca5936bcb8d8b"
SRC_URI[sha256sum] = "fbdc51f26ac3e85b30a802a0e9f342cecba7913241b96f635d9d2dbdc1c23ca8"
S = "${WORKDIR}/navigation-release-release-lunar-nav_core-1.15.1-0"

inherit catkin
