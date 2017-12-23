# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "An automatically generated package with all the configuration and launch files f"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native moveit-planners-ompl moveit-ros-move-group moveit-ros-visualization moveit-simple-controller-manager robot-state-publisher vs060"
SRC_URI = "https://github.com/start-jsk/denso-release/archive/release/kinetic/vs060_moveit_config/2.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3540087471ec44234854a93551344dc4"
SRC_URI[sha256sum] = "0a2ee92ff9e27a2f56369ad75ba54f373358988c66ce9c3cf630cf8176580b86"
S = "${WORKDIR}/denso-release-release-kinetic-vs060_moveit_config-2.0.2-0"

inherit catkin
