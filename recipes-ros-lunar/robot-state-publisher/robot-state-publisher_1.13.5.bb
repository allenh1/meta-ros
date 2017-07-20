# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package allows you to publish the state of a robot to     . Once the state "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=22;endline=22;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin eigen kdl_parser liburdfdom-headers-dev orocos_kdl rosconsole roscpp rostest rostime sensor_msgs tf tf2_kdl tf2_ros"
SRC_URI = "https://github.com/ros-gbp/robot_state_publisher-release/archive/release/lunar/robot_state_publisher/1.13.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dd4b002e543d497c7836c6296fe234db"
SRC_URI[sha256sum] = "5aa5970218d7cee523898d2411c14d13bc8d84959ef8d2d2eb40ab62f18bf48e"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
