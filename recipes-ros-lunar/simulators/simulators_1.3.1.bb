# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=6;endline=6;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin gazebo_ros_pkgs robot rqt_common_plugins rqt_robot_plugins stage_ros"
SRC_URI = "https://github.com/ros-gbp/metapackages-release/archive/release/lunar/simulators/1.3.1-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a3b406554eecddebf5bc05d226210109"
SRC_URI[sha256sum] = "db0a0e9af2b7517b2d3460e621033d22319d53649d34fdfd8337b1792378b1e1"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
