# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A 2D navigation stack that takes in information from odometry, sensor         st"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=a282159121152d5d4cb476b08eb1e19a"

DEPENDS = "amcl base-local-planner carrot-planner catkin clear-costmap-recovery costmap-2d dwa-local-planner fake-localization global-planner map-server move-base move-base-msgs move-slow-and-clear nav-core navfn robot-pose-ekf rotate-recovery voxel-grid"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/navigation/1.14.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3956d4679c67f19bc8c37bd15158ee3e"
SRC_URI[sha256sum] = "dafd58738b4ea0db8d2db977b36255f9c08e469220ac75c2d2d4312314ea54ae"
S = "${WORKDIR}/navigation-release-release-lunar-navigation-1.14.0-0"

inherit catkin
