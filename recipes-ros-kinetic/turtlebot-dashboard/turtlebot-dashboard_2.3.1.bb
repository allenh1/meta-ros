# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Launchers for the base-specific dashboards"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native create-dashboard kobuki-dashboard"
SRC_URI = "https://github.com/turtlebot-release/turtlebot_interactions-release/archive/release/kinetic/turtlebot_dashboard/2.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "191cc5ea31b986c8d041a6224449a869"
SRC_URI[sha256sum] = "e1adf8ce1d7f6a2dfb5a3f35006a460397281a5b26e267000bc7787677697434"
S = "${WORKDIR}/turtlebot_interactions-release-release-kinetic-turtlebot_dashboard-2.3.1-0"

inherit catkin
