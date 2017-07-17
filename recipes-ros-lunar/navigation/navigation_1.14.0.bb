# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A 2D navigation stack that takes in information from odometry, sensor
        st"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD,LGPL,LGPL (amcl)"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=41f7b862c2c7142801a38ab11524d471"

DEPENDS = "amcl base_local_planner carrot_planner catkin clear_costmap_recovery costmap_2d dwa_local_planner fake_localization global_planner map_server move_base move_base_msgs move_slow_and_clear nav_core navfn robot_pose_ekf rotate_recovery voxel_grid"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/navigation/1.14.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3956d4679c67f19bc8c37bd15158ee3e"
SRC_URI[sha256sum] = "dafd58738b4ea0db8d2db977b36255f9c08e469220ac75c2d2d4312314ea54ae"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
