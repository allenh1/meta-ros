# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A 2D navigation stack that takes in information from odometry, sensor         st"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2988eb2faff9dfbcfa1c72a9efc3fa78"

DEPENDS = "amcl base-local-planner carrot-planner catkin-native clear-costmap-recovery costmap-2d dwa-local-planner fake-localization global-planner map-server move-base move-base-msgs move-slow-and-clear nav-core navfn robot-pose-ekf rotate-recovery voxel-grid"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/kinetic/${PN}/1.14.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b4d876c0ca162ef0ccab4f36cd665d1c"
SRC_URI[sha256sum] = "29b9b7e32ff22c2670b7bfffbc08d37fae07ca1c7119d1ae221de8ed8cfce029"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-1.14.2-0"

inherit catkin
