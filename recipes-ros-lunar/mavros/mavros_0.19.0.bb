# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "MAVROS -- MAVLink extendable communication node for ROS
    with proxy for Groun"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPLv3LGPLv3BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "angles boost catkin cmake_modules diagnostic_msgs diagnostic_updater eigen eigen_conversions geometry_msgs libmavconn mavlink mavros_msgs message_runtime nav_msgs pluginlib rosconsole_bridge roscpp rospy sensor_msgs std_msgs std_srvs tf2_ros"
SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/lunar/mavros/0.19.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "433aba33d6ad0e9b1eecba2abf705b18"
SRC_URI[sha256sum] = "cd746061bc94ebb925b04399923a9c7796aa0f87047388baf4642a0b88bc94f7"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
