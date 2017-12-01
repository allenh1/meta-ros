# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A 2D navigation stack that takes in information from odometry, sensor         st"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=2988eb2faff9dfbcfa1c72a9efc3fa78"

DEPENDS = "amcl base-local-planner carrot-planner catkin-native clear-costmap-recovery costmap-2d dwa-local-planner fake-localization global-planner map-server move-base move-base-msgs move-slow-and-clear nav-core navfn robot-pose-ekf rotate-recovery voxel-grid"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/lunar/${PN}/1.15.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "088056d307e16b6a1d15e65e7f69752a"
SRC_URI[sha256sum] = "96414d83686b5a8d65fc6110baaf44329295e4b68af91909e519fb5891087eb8"
S = "${WORKDIR}/${PN}-release-release-lunar-${PN}-1.15.1-0"

inherit catkin
